// Place your Spring DSL code here
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import com.luxsoft.CustomAuditLogListener
beans = {
	localeResolver(SessionLocaleResolver) { 
        defaultLocale= new java.util.Locale('us'); 
    }

    customAuditLogListener(CustomAuditLogListener) {
        dataSource = ref('dataSource')
    }
}
