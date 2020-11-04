# Builder Pattern(ver.Effective Java)
---
## Builder Pattern
생성자에 매개 변수가 많을 경우 사용하는 방식으로 객체 생성을 깔끔하고 유연하게 하기 위한 기법이다.

## 장점
- 각 인자가 어떤 의미인지 알기 쉽다
- `.` 체인을 사용하기 때문에 깔끔하게 보인다
- `setter` 메소드가 없으므로 immutable 한 객체를 생성할 수 있다
- 한 번에 객체를 생성하므로 객체 일관성이 깨지지 않는다
- `build()` 함수가 잘못된 값이 입력되었는지 검증하게 할 수도 있다

#### `Tip`
> 클래스에 Lombok의 `@Builder` 어노테이션을 사용하면 Effective Java의 빌더 패턴과 비슷한 패턴으로 사용 할 수 있다. 

## 예제
[Builder Pattern 소스 코드](/src/NutritionFact.java)
```java
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
```