package sx.server

import sx.security.*

class BootStrap {

    def init = { servletContext ->
      
      def userRole = Role.findOrSaveWhere(authority:'ROLE_USER')
      def adminRole = Role.findOrSaveWhere(authority:'ROLE_ADMIN')
      def comprasUserRole = Role.findOrSaveWhere(authority: 'ROLE_COMPRAS_USER')
      def cxcUserRole = Role.findOrSaveWhere(authority: 'ROLE_CXC_USER')

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

    }
    def destroy = {
    }
}
