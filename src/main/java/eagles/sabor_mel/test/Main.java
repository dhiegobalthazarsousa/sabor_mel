package eagles.sabor_mel.test;

import eagles.sabor_mel.dao.FuncionarioDAO;
import eagles.sabor_mel.model.Acesso;
import eagles.sabor_mel.model.Bairro;
import eagles.sabor_mel.model.Cidade;
import eagles.sabor_mel.model.Documento;
import eagles.sabor_mel.model.Endereco;
import eagles.sabor_mel.model.Estado;
import eagles.sabor_mel.model.Funcionario;
import eagles.sabor_mel.model.Sexo;
import eagles.sabor_mel.model.Telefone;
import eagles.sabor_mel.model.TipoDocumento;
import eagles.sabor_mel.model.TipoTelefone;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        
        FuncionarioDAO func = new FuncionarioDAO();
        Calendar cal = Calendar.getInstance();
        cal.set(1987, 5, 18);
        Funcionario funcionario = new Funcionario("dhiegosousa", "abc123", Acesso.Administrador, "dhiego sousa", "henrique@gmail.com", cal, Sexo.Masculino);
        Documento doc = new Documento("12345678910", TipoDocumento.CPF);
        funcionario.setDocumento(doc);
        Estado estado = new Estado("São Paulo", "SP");
        Cidade cidade = new Cidade("Caraguatatuba");
        cidade.setEstado(estado);
        Bairro bairro = new Bairro("Indaia");
        bairro.setCidade(cidade);
        Endereco end = new Endereco("av cuiaba", "38", "11665295");
        end.setBairro(bairro);
        funcionario.setEndereco(end);
        Telefone tel = new Telefone("12", "38832988", TipoTelefone.Fixo);
        funcionario.addTelefone(tel);
        
        func.merge(funcionario);
    }
}
