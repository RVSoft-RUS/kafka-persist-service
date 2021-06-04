package ru.sbrf.ckr.sberboard.kafkapersistservice.model;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.ckr.sberboard.kafkapersistservice.entity.MessageObject;

import java.util.*;

public class TopicEntityRepoLink {
    private final Map<String, Element> elements = new HashMap<>();

    static class Element {
        final Class<?> entity;
        final CrudRepository<?, String> repo;

        Element(Class<?> entity, CrudRepository<?, String> repo) {
            this.entity = entity;
            this.repo =  repo;
        }

        public final Class<?> getEntity() {
            return entity;
        }

        public final CrudRepository<? extends MessageObject, String> getRepo() {
            return (CrudRepository<? extends MessageObject, String>) repo;
    }

        public final int hashCode() {
            return Objects.hashCode(repo) ^ Objects.hashCode(entity) ;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Element) {
                Element e = (Element) o;
                return Objects.equals(entity, e.getEntity()) && Objects.equals(repo, e.getRepo());
            }
            return false;
        }
    }

    public void put(String topic, Class<?> entity, CrudRepository<?, String> repo) {
        Element element =  new Element(entity, repo);
        if (!elements.containsKey(topic)) {
            elements.put(topic, element);
        }
    }

    public Class<?> getEntity(String topic) {
        return elements.get(topic).getEntity();
    }

    public CrudRepository<? extends MessageObject, String> getRepo(String topic) {
        return elements.get(topic).getRepo();
    }
}
