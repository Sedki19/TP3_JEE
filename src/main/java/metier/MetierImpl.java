package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Pcs> getPcssParMotCle(String mc) {
List<Pcs> pcs= new ArrayList<Pcs>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from Pcs where NOM_Pcs LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Pcs p = new Pcs();
p.setIdPcs(rs.getLong("ID_Pcs"));
p.setNomPcs(rs.getString("NOM_Pcs"));
p.setPrix(rs.getDouble("PRIX"));
p.setSpecs(rs.getString("Specs"));
pcs.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return pcs;
}
@Override
public void addPcs(Pcs p) {
// TODO Auto-generated method stub
}
}