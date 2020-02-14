package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimensao = toolkit.getScreenSize();
		
		System.out.println("Largura da Tela -> " + dimensao.width + " x "  + dimensao.height + " <- Altura da tela");
	}

}
