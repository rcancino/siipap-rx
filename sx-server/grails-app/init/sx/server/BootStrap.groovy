package sx.server

import sx.core.AppConfig
import sx.core.Sucursal
import sx.security.*
import org.bouncycastle.jce.provider.BouncyCastleProvider

class BootStrap {

  def init = { servletContext ->

    java.security.Security.addProvider(new BouncyCastleProvider())

    def userRole = Role.findOrSaveWhere(authority:'ROLE_USER')
    def adminRole = Role.findOrSaveWhere(authority:'ROLE_ADMIN')
    def comprasUserRole = Role.findOrSaveWhere(authority: 'ROLE_COMPRAS_USER')
    def cxcUserRole = Role.findOrSaveWhere(authority: 'ROLE_CXC_USER')
    def posUserRole = Role.findOrSaveWhere(authority: 'ROLE_POS_USER')

    // Inventarios
    def inventarioUser = Role.findOrSaveWhere(authority: 'ROLE_INVENTARIO_USER')
    def inventarioManager = Role.findOrSaveWhere(authority: 'ROLE_INVENTARIO_MANAGER')

    def embarquesUserRole = Role.findOrSaveWhere(authority: 'ROLE_EMBARQUES_USER')
    def embarquesManagerRole = Role.findOrSaveWhere(authority: 'ROLE_EMBARQUES_MANAGER')


    def admin=User.findByUsername('admin')

    if(!admin) {
      admin=new User(username:'admin'
        ,password:'admin'
        ,apellidoPaterno:'admin'
        ,apellidoMaterno:'admin'
        ,nombres:'admin'
        ,nombre:' ADMIN ADMIN'
        ,numeroDeEmpleado:'0000')
      .save()

      UserRole.create admin, userRole
      UserRole.create admin, adminRole
      UserRole.create admin, comprasUserRole

      UserRole.withSession {
        it.flush()
        it.clear()
      }
    }

    if(!UserRole.exists(admin.id, cxcUserRole.id)) {
      UserRole.create admin, cxcUserRole
      UserRole.withSession {
        it.flush()
        it.clear()
      }
    }

    if(!UserRole.exists(admin.id, posUserRole.id)) {
      UserRole.create admin, posUserRole
      UserRole.withSession {
        it.flush()
        it.clear()
      }
    }


    if(!UserRole.exists(admin.id, inventarioUser.id)) {
        UserRole.create admin, inventarioUser
        UserRole.withSession {
            it.flush()
            it.clear()
        }
    }
    if(!UserRole.exists(admin.id, inventarioManager.id)) {
        UserRole.create admin, inventarioManager
        UserRole.withSession {
            it.flush()
            it.clear()
        }
    }

    if(!UserRole.exists(admin.id, embarquesUserRole.id)) {
        UserRole.create admin, embarquesUserRole
        UserRole.withSession {
            it.flush()
            it.clear()
        }
    }

    if(!UserRole.exists(admin.id, embarquesManagerRole.id)) {
        UserRole.create admin, embarquesManagerRole
        UserRole.withSession {
            it.flush()
            it.clear()
        }
    }

    def appConfig = AppConfig.first();
    if (appConfig == null) {
        appConfig = new AppConfig()
        appConfig.sucursal = Sucursal.where { clave == 12}.find()
        File cfdiDir = new File("${System.getProperty('user.home')}/cfdis")
        if(!cfdiDir.exists()) {
            cfdiDir.mkdir();
        }
        appConfig.cfdiLocation = cfdiDir.toURI().toString()
        appConfig.save()
    }

  }

  def destroy = {
  }
}
