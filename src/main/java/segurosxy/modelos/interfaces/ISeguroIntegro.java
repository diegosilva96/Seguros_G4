package segurosxy.modelos.interfaces;

public interface ISeguroIntegro extends ISeguroporRobo,ISeguroporChoque,ISeguroSoat {
 public void CoberturaCompleta();
 public void CoberturaChoque();
 public void CoberturaRobo();
 public void CoberturaAccidenteTransito();
}
