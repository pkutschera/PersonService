package de.novatec.aws.sample.boot.person.data

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories
import org.springframework.data.jdbc.repository.config.JdbcConfiguration
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType
import org.springframework.transaction.PlatformTransactionManager
import javax.sql.DataSource

@Configuration
@EnableJdbcRepositories
class CustomerConfig : JdbcConfiguration() {

    @Bean
    fun operations() : NamedParameterJdbcOperations {
        return NamedParameterJdbcTemplate(dataSource());
    }

    @Bean
    fun transactionManager() : PlatformTransactionManager {
        return DataSourceTransactionManager(dataSource());
    }

    @Bean
    fun dataSource() : DataSource {
        return EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(EmbeddedDatabaseType.HSQL)
                .build();
    }
}