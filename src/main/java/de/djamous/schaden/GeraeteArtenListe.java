package de.djamous.schaden;

import java.util.List;

public class GeraeteArtenListe {
	private String paramname;
	private String paramtype;
	private List<Paramvalue> paramvalues;
	public String getParamname() {
		return paramname;
	}
	public void setParamname(String paramname) {
		this.paramname = paramname;
	}
	public String getParamtype() {
		return paramtype;
	}
	public void setParamtype(String paramtype) {
		this.paramtype = paramtype;
	}
	public List<Paramvalue> getParamvalues() {
		return paramvalues;
	}
	public void setParamvalues(List<Paramvalue> paramvalues) {
		this.paramvalues = paramvalues;
	}
}