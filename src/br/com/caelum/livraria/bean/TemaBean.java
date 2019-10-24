package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemaBean {
	
	private String tema = "nova-dark";

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public String[] getTemas() {
	    return new String[] { "afterdark", "afternoon", "afterwork", "aristo",
	            "black-tie", "blitzer", "bluesky", "bootstrap", "casablanca",
	            "cupertino", "cruze", "dark-hive", "delta", "dot-luv",
	            "eggplant", "excite-bike", "flick", "glass-x", "home",
	            "hot-sneaks", "humanity", "le-frog", "midnight", "mint-choc",
	            "overcast", "pepper-grinder", "redmond", "rocket", "sam",
	            "smoothness", "south-street", "start", "sunny", "swanky-purse",
	            "trontastic", "ui-darkness", "ui-lightness", "vader" };
	}
	
//	<p:themeSwitcher id="basic" style="width:165px" value="#{temaBean.tema}">
//    <f:selectItem itemLabel="Choose Theme" itemValue="" />
//    <f:selectItems value="#{temaBean.temas}" var="tema" itemLabel="#{tema}" itemValue="#{tema}" />
//    <f:ajax />
//</p:themeSwitcher>
	
	
}
