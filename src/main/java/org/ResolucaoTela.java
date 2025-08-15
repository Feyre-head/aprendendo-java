import java.awt.*;

public class ResolucaoTela {

    public static void main(String[] args) {

        //Pega a resolução da tela

        //Obtém as dimensões da tela x e y
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //printa largura
        System.out.println(screenSize.width);

        //printa altura
        System.out.println(screenSize.height);


        //Toolkit.getDefaultToolkit() → acessa o ambiente gráfico do sistema operacional
        //getScreenSize() → retorna a largura e altura da tela atual como um objeto Dimension
        //screenSize.width → largura da tela em pixels
        //screenSize.height → altura da tela em pixels

    }
}
