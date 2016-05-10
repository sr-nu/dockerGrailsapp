dataSource {
	pooled = true
    jmxExport = true
	driverClassName = 'com.mysql.jdbc.Driver'
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context

	format_sql = true
	use_sql_comments = true
}

environments {
	development {
		dataSource {
			dbCreate = 'create-drop' // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql//${DB_PORT_3306_TCP_ADDR}:${DB_PORT_3306_TCP_PORT}"
            username = "admin"
            password = "pass1"
		}
	}
	test {
		dataSource {
			dbCreate = 'create-drop'
            url = "jdbc:mysql//${DB_PORT_3306_TCP_ADDR}:${DB_PORT_3306_TCP_PORT}"
            username = "admin"
            password = "pass1"
		}
	}
	production {
		dataSource {
			dbCreate = 'create-drop'
            url = "jdbc:mysql//${DB_PORT_3306_TCP_ADDR}:${DB_PORT_3306_TCP_PORT}"
            username = "admin"
            password = "pass1"
		}
	}
}
