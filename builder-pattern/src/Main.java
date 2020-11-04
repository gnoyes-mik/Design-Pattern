public class Main {
    public static void main(String[] args) {
        NutritionFact cocaCola = new NutritionFact
                .Builder(240, 8)
                .calories(320)
                .fat(22)
                .sodium(35)
                .build();
    }
}
