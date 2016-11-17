/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eagles.sabor_mel.control;

import eagles.sabor_mel.dao.FuncionarioDAO;
import eagles.sabor_mel.model.Acesso;
import eagles.sabor_mel.model.Funcionario;
import eagles.sabor_mel.model.Sexo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dhiego.balthazar
 */
public class ControllerFuncionario {
    
    /*
     * @author dhiego
     * This function calls VendaDAO and CrediarioDAO to persist a sell.
     *
     */
    
    public Map<String, String> searchFuncionario(String nome){
        FuncionarioDAO daoFuncionario = new FuncionarioDAO();
        Funcionario funcionario = daoFuncionario.getByName(nome);
        Map <String, String> specFuncionario = new HashMap<>();
        specFuncionario.put("idFuncionario", String.valueOf(funcionario.getIdPessoa()));
        specFuncionario.put("nome", funcionario.getNome());
        specFuncionario.put("email", funcionario.getEmail());
        specFuncionario.put("idDocumento", funcionario.getDocumento().getNumero());
        specFuncionario.put("sexo", String.valueOf(funcionario.getSexo()));
        specFuncionario.put("username", funcionario.getUsuario());
        specFuncionario.put("senha", funcionario.getSenha());
        return specFuncionario;
        Funcioanrio func = new Funcionario();
    }

    private Calendar transformData(String data) {
        Calendar cal = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            cal = Calendar.getInstance();
            cal.setTime(sdf.parse(data));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cal;
    }
    
    public List<Funcionario> findByName(String nome){        
        FuncionarioDAO dao = new FuncionarioDAO();
        return null; //dao.getByName(nome);
    }

}