/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -679998315;

	/**
	 * The singleton instance of <code>information_schema</code>
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("information_schema");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.mysql.information_schema.tables.Columns.COLUMNS,
			org.jooq.util.mysql.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE,
			org.jooq.util.mysql.information_schema.tables.Parameters.PARAMETERS,
			org.jooq.util.mysql.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
			org.jooq.util.mysql.information_schema.tables.Schemata.SCHEMATA,
			org.jooq.util.mysql.information_schema.tables.Statistics.STATISTICS,
			org.jooq.util.mysql.information_schema.tables.Tables.TABLES,
			org.jooq.util.mysql.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}
}
