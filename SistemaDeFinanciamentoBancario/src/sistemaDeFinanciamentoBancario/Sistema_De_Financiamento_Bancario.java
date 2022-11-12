package sistemaDeFinanciamentoBancario;

import javax.swing.JOptionPane;

public class Sistema_De_Financiamento_Bancario {

	public static void main(String[] args) {

		int prosseguir = (int) JOptionPane.showConfirmDialog(null,
				"Bem vindo ao sistema de solicitação de financiamento residencial. Deseja continuar?");
		if (prosseguir == 0) {

			double valorEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da casa que deseja Financiar?"));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu salário?"));
			double juros = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor o valor dos juros POR ANO?"));
			double anos = Double.parseDouble(JOptionPane.showInputDialog("Irá pagar em quantos anos?"));
			double prestacao = valorEmprestimo / (anos * 12);
			double valorParcela = prestacao + (prestacao + juros);

			if (prestacao + (prestacao * juros) <= (salario * 0.3)) {
				JOptionPane.showMessageDialog(null,"Empréstimo de R$" + valorEmprestimo + " foi APROVADO!\n" 
			+ "Os juros aplicados em cada parcela é de " + juros + "% O valor de cada parcela é de R$" + valorParcela +"\n"
			+ "                        **\n"
			+ "                         **\n"
			+"                        **\n"			
			+"                         **\n"
			+"            *          **\n"
			+"       *        *    *****\n"
			+"     *            *  *****\n"
			+"   *                ******\n"
			+" *                    *\n"
			+"***                  ************************\n"
			+"  *                  *                      *\n"
			+"  *                  *       BEM-VINDO      *\n"
			+"  *                  *      A CASA É SUA!   *\n"
			+"  *                  *                      *\n"
			+"  *******************************************");
			} else {
				JOptionPane.showMessageDialog(null, "Empréstimo NEGADO!");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Para Nova solicitação, inicie novamente o sistema!");
		}

	}
}
