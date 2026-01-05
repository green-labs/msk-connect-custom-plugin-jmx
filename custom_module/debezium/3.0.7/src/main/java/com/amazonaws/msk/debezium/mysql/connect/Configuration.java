package com.amazonaws.msk.debezium.mysql.connect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public interface Configuration {

	String CONNECT_JMX_PORT_KEY = "connect.jmx.port";

	String TOPIC_PREFIX_KEY = "topic.prefix";

	String CW_NAMESPACE_KEY = "cloudwatch.namespace.name";

	String CW_REGION_KEY = "cloudwatch.region";

	String CW_DEBEZIUM_STREAM_METRICS_INCLUDE = "cloudwatch.debezium.streaming.metrics.include";

	String CW_DEBEZIUM_STREAM_METRICS_EXCLUDE = "cloudwatch.debezium.streaming.metrics.exclude";

	String CW_DEBEZIUM_SNAPSHOT_METRICS_INCLUDE = "cloudwatch.debezium.snapshot.metrics.include";

    String CW_DEBEZIUM_SNAPSHOT_METRICS_EXCLUDE = "cloudwatch.debezium.snapshot.metrics.exclude";

	String CW_DEBEZIUM_SCHEMA_HISTORY_METRICS_INCLUDE = "cloudwatch.debezium.schema.history.metrics.include";

	String CW_DEBEZIUM_SCHEMA_HISTORY_METRICS_EXCLUDE = "cloudwatch.debezium.schema.history.metrics.exclude";

	String CW_SYSTEM_METRICS_ENABLED = "cloudwatch.system.metrics.enabled";

	// Default metrics sets
    public static final Set<String> CW_DEBEZIUM_DEFAULT_STREAMING_METRICS =
	new HashSet<>(Arrays.asList(
            "NumberOfCommittedTransactions",
            "MilliSecondsBehindSource"
    ));

    public static final Set<String> CW_DEBEZIUM_DEFAULT_SNAPSHOT_METRICS =
	new HashSet<>(Arrays.asList(
            "TotalTableCount",
            "RemainingTableCount"
    ));

    public static final Set<String> CW_DEBEZIUM_DEFAULT_SCHEMA_HISTORY_METRICS =
	new HashSet<>(Arrays.asList(
            "Status",
            "LastAppliedChange"
    ));

	String DEFAULT_CW_NAMESPACE = "MSK_Connect";

	int DEFAULT_JMX_PORT = 1098;

	long SCHEDULER_INITIAL_DELAY = 60000;

	long SCHEDULER_PERIOD = 15000;

	String JMX_URL_TEMPLATE = "service:jmx:rmi://localhost/jndi/rmi://localhost:%d/jmxrmi";

	String STREAMING_MBEAN_OBJECT_NAME_TEMPLATE = "debezium.mysql:type=connector-metrics,context=streaming,server=%s";

	String SNAPSHOT_MBEAN_OBJECT_NAME_TEMPLATE = "debezium.mysql:type=connector-metrics,context=snapshot,server=%s";

	String SCHEMA_HISTORY_MBEAN_OBJECT_NAME_TEMPLATE = "debezium.mysql:type=connector-metrics,context=schema-history,server=%s";

	String OPERATING_SYSTEM_MBEAN_OBJECT_NAME = "java.lang:type=OperatingSystem";

	String MEMORY_MBEAN_OBJECT_NAME = "java.lang:type=Memory";
}
