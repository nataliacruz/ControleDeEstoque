/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DimensionaImagem;

import MenuPrincipal.MenuPrincipal;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcos
 */
public class DimensionaImagem {
    
    public void dimensionaComponentes(javax.swing.JLabel LabelImagemFundo, String CaminhoImagem, int Largura, int Altura) {        
        File foto = new File(CaminhoImagem);
        BufferedImage bi;
        try {
            bi = ImageIO.read(foto); //carrega a imagem real num buffer
            BufferedImage aux = new BufferedImage(Largura, Altura, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
        Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
        AffineTransform at = AffineTransform.getScaleInstance((double) Largura / bi.getWidth(), (double) Altura / bi.getHeight());//cria a transformacao    
        g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar
        LabelImagemFundo.setIcon(new ImageIcon(aux));
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
