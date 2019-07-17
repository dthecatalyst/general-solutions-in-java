import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TakeAndDropWhileChallenge {
    public static void main(String... castleVania){
        List<Integer> alucardHits = List.of(9,7,1,8,5);
        Set<Integer>draculaHist =Set.of(9,6,5,7,8);

        Stream<Integer>alucardPerformanceHits = alucardHits.stream()
                .takeWhile(i->i>5)
                .dropWhile(i->i>8);

        Stream<Integer> draculaPerformedHits = draculaHist.stream()
                .takeWhile(i->i>1)
                .dropWhile(i->i>7);

        Stream.of(alucardPerformanceHits,draculaPerformedHits).flatMap(h->h)
                .forEach(System.out::print);

    }
}
//7 and random value.