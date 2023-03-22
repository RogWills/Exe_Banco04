import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int numero;
        double saldo,limite,rendimento;

        JOptionPane.showMessageDialog(null,"Seja bem vindo ao Banco NewTon!",null,JOptionPane.INFORMATION_MESSAGE);
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua escola: \n1 - Conta Corrente \n 2 - Conta Poupança\n 3 - Sair"));

            switch (opcao) {
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: "));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                    limite = Double.parseDouble(JOptionPane.showInputDialog("Limite:"));
                    ContaCorrente cc1 = new ContaCorrente(numero, saldo, limite);
                    JOptionPane.showMessageDialog(null, "Saldo: " + cc1.getSaldo() + "\nSaldo com limite: " + cc1.consultaSaldoTotal(), "Conta Corrente" + numero, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero da conta: ","Conta",JOptionPane.INFORMATION_MESSAGE));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                    rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
                    ContaPoupanca cp1 = new ContaPoupanca(numero, saldo, rendimento);
                    cp1.atualizaRendimento();
                    JOptionPane.showMessageDialog(null,"Saldo da C/P: "+ saldo+ "\n Rendimento da C/P: "+cp1.getSaldo(),"Conta Poupança - " + numero,JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Finalizado com sucesso!","FIM",JOptionPane.CANCEL_OPTION);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digitar somente o numero valido.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }