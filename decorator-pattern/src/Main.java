public class Main {
    public static void main(String[] args){
        // 그냥 크리스마스 트리
        ChristmasTree tree = new NomalChristmasTree();
        System.out.println(tree.decorate());

        // 크리스마스 트리 + 불빛 장식
        ChristmasTree treeWithLights = new Light(new NomalChristmasTree());
        System.out.println(treeWithLights.decorate());

        // 크리스마스 트리 + 불빛 장식 + 꽃 장식
        ChristmasTree treeWithLightsWithFlowers = new Flower(new Light(new NomalChristmasTree()));
        System.out.println(treeWithLightsWithFlowers.decorate());
    }
}
