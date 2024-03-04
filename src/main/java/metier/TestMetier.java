package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Pcs> pcs = metier.getPcssParMotCle("ms");
for (Pcs p : pcs)
System.out.println(p.getNomPcs());
}
}