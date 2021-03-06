package BasicAlgo;

public class MainAlgo {
    public static void main(String[] args) {
        // Create GA object
        GeneticAlgorithm ga = new GeneticAlgorithm(100, 0.0015, 0.95, 2);
        Population population = ga.initPopulation(50);
        // The following is the new code you should be adding:
        ga.evalPopulation(population);
        int generation = 1;
        while (ga.isTerminationConditionMet(population) == false) {
            // Print fittest individual from population
            System.out.println("Best solution: " + population.getFittest(0).toString());
            // DONE! : Apply crossover
            population = ga.crossoverPopulation(population);
            // DONE! : Apply mutation
            population = ga.mutatePopulation(population);
            // DONE! : Evaluate population
            ga.evalPopulation(population);
            // Increment the current generation
            generation++;
        }
        System.out.println("Found solution in " + generation + "generations");
        System.out.println("Best solution: " + population.getFittest(0).toString());
    }

}
