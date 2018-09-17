public class Principal{

  public static void main(String[] args){
    
    /*
    Gerente g1 = new Gerente();

    g1.setNome("Anderson");
    g1.setCpf("123.456.789-00");
    g1.setSalario(5000);

    g1.setSenha(2222);

    System.out.println(g1.autentica(2222));
    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());
    System.out.println(g1.getBonificacao());
	
	*/

	Gerente g1 = new Gerente();
    g1.setNome("Anderson");
    g1.setSalario(5000.0);

    EditorVideo ev = new EditorVideo();
    ev.setSalario(2500.0);

    Designer d = new Designer();
    d.setSalario(2000.0);

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(g1);
    controle.registra(ev);
    controle.registra(d);

    System.out.println(controle.getSoma());
  }
}