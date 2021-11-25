public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silva");
        paulo.setCpf("022.123.932-12");
        paulo.setProfissao("Analista de sistema");

        Conta contaDoPaulo = new Conta(123,221);
        contaDoPaulo.deposita(100);

        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().getNome());
        System.out.println(contaDoPaulo.getTitular());
    }
}
