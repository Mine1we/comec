import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class ainda{

    public static void main(String[] args) {
        JFrame janela = new JFrame("Então esse é o teste?");
        janela.setSize(500, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        painel.setBackground(new Color(255, 233, 186));

        
        JLabel rotulo = new JLabel("ta me tirando?");
        rotulo.setFont(new Font("Calibri", Font.BOLD, 24));
        rotulo.setForeground(new Color(50, 50, 50));

        JButton botaozinho = new JButton("sé loco truta?!");
        botaozinho.setFont(new Font("Arial", Font.PLAIN, 18));
        botaozinho.setBackground(new Color(0, 122, 255));
        botaozinho.setForeground(Color.WHITE);
        botaozinho.setFocusPainted(false);
        botaozinho.setPreferredSize(new Dimension(150, 40));
        botaozinho.setBorder(BorderFactory.createLineBorder(new Color(0, 122, 255),2));
        botaozinho.addActionListener(e -> rotulo.setText("qual fita tio? ja te levo pazideia em cumpadre!"));

        JButton botaozin = new JButton("Sim");
        botaozin.setFont(new Font("Arial", Font.PLAIN, 18));
        botaozin.setBackground(new Color(0, 122, 255));
        botaozin.setForeground(Color.WHITE);
        botaozin.setFocusPainted(false);
        botaozin.setPreferredSize(new Dimension(150, 40));
        botaozin.setBorder(BorderFactory.createLineBorder(new Color(0, 122, 255), 2));
        botaozin.addActionListener(e -> rotulo.setText("aah se eu te pego em"));
        
        painel.add(rotulo, BorderLayout.CENTER);
        painel.add(botaozinho, BorderLayout.SOUTH);
        painel.add(botaozin, BorderLayout.SOUTH);
        painel.add(rotulo);
        painel.add(botaozinho);
        painel.add(botaozin);
        janela.add(painel);
        janela.setVisible(true);




    }
}
