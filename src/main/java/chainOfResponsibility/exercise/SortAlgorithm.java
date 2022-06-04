package chainOfResponsibility.exercise;


public interface SortAlgorithm {
    void setNext(SortAlgorithm algorithm);
    void criteriaHandler(Persona[] persona);
    SortAlgorithm next();

}
