CREATE KEYSPACE rrlabs_product WITH replication = {'class' : 'SimpleStrategy','replication_factor' : 1};

create columnFamily rrlabs_product.product (
	id UUID,
	name text,
	description text,
    price text,
	created timestamp,
	modified timestamp,
	PRIMARY KEY (id)
);











