/*
 * This file is generated by jOOQ.
 */
package models.tables;


import javax.annotation.Generated;

import models.Public;
import models.tables.records.SampleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Sample extends TableImpl<SampleRecord> {

    private static final long serialVersionUID = 2043468629;

    /**
     * The reference instance of <code>public.sample</code>
     */
    public static final Sample SAMPLE = new Sample();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SampleRecord> getRecordType() {
        return SampleRecord.class;
    }

    /**
     * The column <code>public.sample.id</code>.
     */
    public final TableField<SampleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.sample.temp</code>.
     */
    public final TableField<SampleRecord, String> TEMP = createField("temp", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.sample</code> table reference
     */
    public Sample() {
        this(DSL.name("sample"), null);
    }

    /**
     * Create an aliased <code>public.sample</code> table reference
     */
    public Sample(String alias) {
        this(DSL.name(alias), SAMPLE);
    }

    /**
     * Create an aliased <code>public.sample</code> table reference
     */
    public Sample(Name alias) {
        this(alias, SAMPLE);
    }

    private Sample(Name alias, Table<SampleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sample(Name alias, Table<SampleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sample(Table<O> child, ForeignKey<O, SampleRecord> key) {
        super(child, key, SAMPLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sample as(String alias) {
        return new Sample(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sample as(Name alias) {
        return new Sample(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sample rename(String name) {
        return new Sample(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sample rename(Name name) {
        return new Sample(name, null);
    }
}