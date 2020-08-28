package ar.com.patrones_de_diseno.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.patrones_de_diseno.dao.UsuarioDao;
import ar.com.patrones_de_diseno.domain.Usuario;
import ar.com.patrones_de_diseno.jdbc.Administrador_De_Conexiones;

public class UsuarioDaoImpl implements UsuarioDao {

	@Override
    public Usuario crearUsuario(Usuario UsuarioACrear) throws Exception{
        
        System.out.println("Creando usuario " + UsuarioACrear.getNombre() + " en base de datos...");

        Connection con = Administrador_De_Conexiones.obtenerConexion();
        
        String sql = "INSERT INTO PLAN_DE_AHORRO (NOMBRE, APELLIDO, AUTO) VALUES ('" + UsuarioACrear.getNombre() + 
                "', '" + UsuarioACrear.getApellido() + "', '" + UsuarioACrear.getAuto() + "')";
		
        Statement st = con.createStatement();

        ResultSet rs = null;
        
        st.execute(sql, Statement.RETURN_GENERATED_KEYS);
        
        rs = st.getGeneratedKeys();

        Integer idGenerado = null;

        if(rs.next()) {

        	idGenerado = rs.getInt(1);

        }
        
        UsuarioACrear.setId(idGenerado);

        return UsuarioACrear;
        
        }
                        
    }


