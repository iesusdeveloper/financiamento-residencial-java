package sistemaDeFinanciamentoBancario;

import javax.swing.JOptionPane;

public class Sistema_De_Financiamento_Bancario {

	public static void main(String[] args) {

		int prosseguir = (int) JOptionPane.showConfirmDialog(null,
				"Bem vindo ao sistema de solicita��o de financiamento residencial. Deseja continuar?");
		if (prosseguir == 0) {

			double valorEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da casa que deseja Financiar?"));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu sal�rio?"));
			double juros = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor o valor dos juros POR ANO?"));
			double anos = Double.parseDouble(JOptionPane.showInputDialog("Ir� pagar em quantos anos?"));
			double prestacao = valorEmprestimo / (anos * 12);
			double valorParcela = prestacao + (prestacao + juros);

			if (prestacao + (prestacao * juros) <= (salario * 0.3)) {
				JOptionPane.showMessageDialog(null,"Empr�stimo de R$" + valorEmprestimo + " foi APROVADO!\n" 
			+ "Os juros aplicados em cada parcela � de " + juros + "% O valor de cada parcela � de R$" + valorParcela +"\n"
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
			+"  *                  *      A CASA � SUA!   *\n"
			+"  *                  *                      *\n"
			+"  *******************************************");
			} else {
				JOptionPane.showMessageDialog(null, "Empr�stimo NEGADO!");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Para Nova solicita��o, inicie novamente o sistema!");
		}

	}
}
