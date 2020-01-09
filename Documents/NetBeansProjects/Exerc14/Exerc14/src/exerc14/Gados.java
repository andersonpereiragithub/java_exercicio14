package exerc14;
public class Gados {
     public void setCodigo(int novoCodigo)
        {
            codigo = novoCodigo;
        }
        public int getCodigo()
        {
            return codigo;
        }
        public void setIdade(int mNasc, int aNasc)
        {
            int mAtual = 01;
            int aAtual = 2020;
            int converteEmDias = (((mAtual * 30) + (aAtual * 365)) - ((mNasc * 30) + (aNasc * 365)));

            idade = converteEmDias / 365;
        }
        public int getIdade()
        {
            return idade;
        }
        public void setLeite(double novoLeite)
        {
            leite = novoLeite;
        }
        public double getLeite()
        {
            return leite;
        }
        public void setAlimento(double novoAlimento)
        {
            alimento = novoAlimento;
        }
        public double getAlimento()
        {
            return alimento;
        }
        public void setAbate(int idade, int leite, int alimento)
        {
            if (idade > 5 || leite < 40 || leite > 50 && leite < 70 && alimento > 50)
            {
                abate = "SIM";
            }
            else
            {
                abate = "NÃO";
            }
            
        }
        public String getAbate()
        {
            return abate;
        }
        private int codigo;
        private int idade;
        private double leite;
        private double alimento;
        private String abate;

        public Gados()
        {
            codigo = 000;
            idade = 00;
            leite = 0.0;
            alimento = 0.0;
            abate = "NÃO";
        }
}
