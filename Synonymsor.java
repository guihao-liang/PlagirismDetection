import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by GuihaoLiang on 11/3/16.
 * get synonyms for abstract file
 * Object K can have multiple meanings, such as V1, V2, V3...
 * for same group, (K1, K2, K3), every K should be different.
 * V should be unique
 */
public interface Synonymsor<K extends Comparable<K>, V extends Comparable<V>> {
    Map<K, List<V>> getSynonyms();
    Map<V, List<K>> getInversedSyno();
}
