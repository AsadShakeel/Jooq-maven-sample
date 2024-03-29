/*
 * This file is generated by jOOQ.
 */
package models.tables.records;


import javax.annotation.Generated;

import models.tables.Sample;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SampleRecord extends TableRecordImpl<SampleRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -2031315315;

    /**
     * Setter for <code>public.sample.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.sample.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.sample.temp</code>.
     */
    public void setTemp(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.sample.temp</code>.
     */
    public String getTemp() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sample.SAMPLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sample.SAMPLE.TEMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTemp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTemp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleRecord value2(String value) {
        setTemp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SampleRecord
     */
    public SampleRecord() {
        super(Sample.SAMPLE);
    }

    /**
     * Create a detached, initialised SampleRecord
     */
    public SampleRecord(Integer id, String temp) {
        super(Sample.SAMPLE);

        set(0, id);
        set(1, temp);
    }
}
