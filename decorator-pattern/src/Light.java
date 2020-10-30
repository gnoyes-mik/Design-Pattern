public class Light extends TreeDecorator{

    public Light(ChristmasTree christmasTree) {
        // 여기가 포인트
        super(christmasTree);
    }

    public String addLights(){
        return " with Lights";
    }

    @Override
    public String decorate(){
        // 여기도 포인트
        return super.decorate() + addLights();
    }
}
