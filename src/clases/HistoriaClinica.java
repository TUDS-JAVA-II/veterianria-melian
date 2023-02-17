
package clases;

import java.util.Date;

public class HistoriaClinica {
    private String motivoConsulta;
    private Date fechaAtencion;
    
     public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    
    
}
