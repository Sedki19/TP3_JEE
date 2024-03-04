package metier;
import java.io.Serializable;

public class Pcs implements Serializable{
private Long idPcs;
private String nomPcs;
private double prix;
private String Specs;
public Pcs() {
super();
}
public Pcs(String nomPcs, double prix) {
super();
this.nomPcs = nomPcs;
this.prix = prix;
}
public Long getIdPcs() {
return idPcs;
}
public void setIdPcs(Long idPcs) {
this.idPcs = idPcs;
}
public String getNomPcs() {
return nomPcs;
}
public void setNomPcs(String nomPcs) {
this.nomPcs = nomPcs;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
	}
public String getSpecs() {
	return Specs;
}
public void setSpecs(String specs) {
	Specs = specs;
}
	}