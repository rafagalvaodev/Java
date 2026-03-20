package entity;

import java.util.*;

public class Developer {
    private String name;
    private Set<Content> subscriberContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscriberContent.addAll(bootcamp.getContent());
        bootcamp.getSubscriberDeveloper().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscriberContent.stream().findFirst();
        if (content.isPresent()){
            this.completedContent.add(content.get());
            this.subscriberContent.remove(content.get());
        }else {
            System.err.println("Você não esta matriculado em nenhum conteudo");
        }
    }

    public double calculateXPTotal(){
        Iterator<Content> iterator = this.completedContent.iterator();
        double sum = 0;
        while (iterator.hasNext()){
            double next = iterator.next().calculateXP();
            sum += next;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscriberContent() {
        return subscriberContent;
    }

    public void setSubscriberContent(Set<Content> subscriberContent) {
        this.subscriberContent = subscriberContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscriberContent, developer.subscriberContent) && Objects.equals(completedContent, developer.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscriberContent, completedContent);
    }
}
