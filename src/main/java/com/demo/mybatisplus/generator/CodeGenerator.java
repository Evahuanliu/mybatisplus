package com.demo.mybatisplus.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerator {

	public static void main(String[] args) {
		
		//////////// 使用代码生成器 ////////////
		AutoGenerator mpg = new AutoGenerator();

		//////////// 使用全局配置 ////////////
		GlobalConfig gc = new GlobalConfig();	
		// 获取项目路径
		String projectPath = System.getProperty("user.dir");
		// 生成文件的输出目录
		gc.setOutputDir(projectPath + "/src/main/java");
		// 作者
		gc.setAuthor("eva.huan.liu");
		// 开启 swagger2 模式
		gc.setSwagger2(true);
		// 是否打开输出目录
		gc.setOpen(true);
		// 指定生成的主键的ID类型
		gc.setIdType(IdType.AUTO);
		// 如果有同名文件，是否覆盖
		gc.setFileOverride(true);
		// 设置给到代码生成器
		mpg.setGlobalConfig(gc);

		//////////// 数据源配置 ////////////
		DataSourceConfig dsc = new DataSourceConfig();
		// 选择使用 MySQL
		dsc.setDbType(DbType.H2);
		dsc.setUrl("jdbc:h2:mem:TESTDB;DB_CLOSE_DELAY=1000");
		dsc.setDriverName("org.h2.Driver");
		dsc.setUsername("sa");
        /*dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://localhost:3306/eva?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");*/
		mpg.setDataSource(dsc);

		//////////// 包配置 ////////////
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.demo.mybatisplus");
		mpg.setPackageInfo(pc);

		//////////// 策略配置 //////////// 
		StrategyConfig strategy = new StrategyConfig();
		// 包含表，可写多个-user, .. 与exclude二选一配置
		// strategy.setInclude("user");
		// 排除表，可写多个-user, .. 与include二选一配置
		// strategy.setExclude("user", "user1");

		// 表名（驼峰命名）
		strategy.setNaming(NamingStrategy.underline_to_camel);
		// 设置表前缀
		strategy.setTablePrefix(pc.getModuleName() + "_");
		// 字段命名
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		// 【实体】是否为lombok模型（默认 false）
		strategy.setEntityLombokModel(true);
		// 生成 <code>@RestController</code> 控制器
		strategy.setRestControllerStyle(true);		
		mpg.setStrategy(strategy);

		mpg.execute();
	}
}
