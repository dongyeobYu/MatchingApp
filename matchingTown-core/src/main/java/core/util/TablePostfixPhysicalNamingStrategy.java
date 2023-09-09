package core.util;


import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class TablePostfixPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    private final static String  POSTFIX = "TB_";


    // 테이블 전략 테스트 ( 접두사에 TB_ 추가 )
    @Override
    public Identifier toPhysicalTableName(Identifier logicalName, JdbcEnvironment context) {

        final String newName = POSTFIX + logicalName;
        return Identifier.toIdentifier(newName);
    }



}
