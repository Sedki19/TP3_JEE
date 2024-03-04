package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Pcs> getPcssParMotCle(String mc);
public void addPcs(Pcs p);
}