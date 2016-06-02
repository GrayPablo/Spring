package beans;

privileged aspect NoImporta {
declare parents: Persona implements java.io.Serializable;
   
  private static final long Persona.serialVersionUID
      = 5059552858884348572L;   
    public String Persona.toString() {
        StringBuilder sb = new StringBuilder();
       sb.append("Aspecto privilegiado: ")
         .append(getNombre())
         .append(serialVersionUID);
        return sb.toString();
    }
} 