package com.VTI.entity;

import com.VTI.entity.TypeQuestion.TQname;

public class TypeQuestion {
	public int id;
	public enum TQname {
		Essay, Multiple_Choice
	}
	public TQname name;
}
