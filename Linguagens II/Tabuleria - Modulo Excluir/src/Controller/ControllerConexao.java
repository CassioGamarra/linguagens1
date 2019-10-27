package Controller;

import View.ViewPrincipal;
import Model.Conexao;
import Util.*;

//Importações para manipular o arquivo
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Controller da Conexão com o SGBD
 * @author cassio
 */
public class ControllerConexao {
    public ControllerConexao(){}
    Conexao conexao = Conexao.getInstance();
    
    public static boolean statusConexao;
    
    //Verifica no arquivo de conexão se existem os dados
    public void verificaDadosConexao(ViewPrincipal view) throws SQLException{
        String nomeArquivo = "dadosconexao.dat";
        File arquivo = new File(nomeArquivo);
        
        try {
            Scanner leitor = new Scanner(arquivo);
            if(!leitor.hasNextLine()){
                System.out.println("ERRO!");
            }
            else{
                conexao.setIP(leitor.nextLine());
                conexao.setPorta(leitor.nextLine());
                conexao.setDbname(leitor.nextLine());
                conexao.setUser(leitor.nextLine());
                conexao.setPassword(leitor.nextLine());
                
                view.getFieldIP().setText(conexao.getIP());
                view.getFieldPorta().setText(conexao.getPorta());
                view.getFieldNomeDB().setText(conexao.getDbname());
                view.getFieldUser().setText(conexao.getUser());
            }
            
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ControllerConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Salva os dados da conexão
    public void salvarDadosConexao(ViewPrincipal view) throws SQLException{
        String nomeArquivo = "dadosconexao.dat";
        String ip, porta, nomeDB, user, tipo;
        char [] senha;

        ip = view.getFieldIP().getText();
        porta = view.getFieldPorta().getText();
        nomeDB = view.getFieldNomeDB().getText();
        user = view.getFieldUser().getText();
        senha = view.getFieldPassword().getPassword();
        
        try {
            FileWriter fw = new FileWriter(nomeArquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(ip);
            bw.newLine();
            bw.write(porta);
            bw.newLine();
            bw.write(nomeDB);
            bw.newLine();
            bw.write(user);
            bw.newLine();
            bw.write(senha);
            //Fecha os buffers
            bw.close();
            fw.close();
            //Verifica novamente os dados no arquivo
            verificaDadosConexao(view);
            //Tenta conectar com o banco
            Util util = new Util();
            util.cleanJTable(view.getTabelaJogos());
            util.cleanJTable(view.getTabelaJogosExcluidos());
            //ControllerCadastroJogo cadastro = new ControllerCadastroJogo();
            conectar(view);
            view.cadastro.consulta(view);
        }
        catch (IOException ex) {
            Logger.getLogger(ControllerConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Teste de conexão com o banco
    public void conectar(ViewPrincipal view) throws SQLException{
        conexao.conectarBanco();
        if(!conexao.getStatus() && !view.getDialogConexao().isVisible()){
            int opcao = JOptionPane.showConfirmDialog(null, "DESEJA CONFIGURAR A CONEXÃO?");
            if(opcao == 0){
                view.getDialogConexao().setVisible(true);
            }
        }
        else{
            if(conexao.getStatus()){
                JOptionPane.showMessageDialog(null, "CONEXÃO REALIZADA COM SUCESSO!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}