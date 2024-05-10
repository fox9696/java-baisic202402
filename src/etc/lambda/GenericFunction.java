package etc.lambda;
@FunctionalInterface
public interface GenericFunction<X,Y> {
    //X에서 Y를 추출한다는의미
     Y apply(X x);

}
