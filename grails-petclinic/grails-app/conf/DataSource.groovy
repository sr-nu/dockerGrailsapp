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
			pooled = true
			jmxExport = true
			driverClassName = 'com.mysql.jdbc.Driver'
			String host = System.getenv('DB_HOST')
			String port = System.getenv('DB_PORT')
			dbCreate = 'create-drop' // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql//${host}:${port}"
            username = "admin"
            password = "pass1"
		}
	}
	test {
		dataSource {
			pooled = true
			jmxExport = true
			driverClassName = 'com.mysql.jdbc.Driver'
			String host = System.getenv('DB_HOST')
			String port = System.getenv('DB_PORT')
			dbCreate = 'create-drop' // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql//${host}:${port}"
			username = "admin"
			password = "pass1"
		}
	}
	production {
		dataSource {
			pooled = true
			jmxExport = true
			driverClassName = 'com.mysql.jdbc.Driver'
			String host = System.getenv('DB_HOST')
			String port = System.getenv('DB_PORT')
			dbCreate = 'create-drop' // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql//${host}:${port}"
			username = "admin"
			password = "pass1"
		}
	}
}
