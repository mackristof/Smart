package fr.umlv.lastproject.smart.database;

import fr.umlv.lastproject.smart.form.Field;

public class NumericFieldRecord extends FieldRecord {

	private double value;

	public NumericFieldRecord(Field field, double value) {
		super(field);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}