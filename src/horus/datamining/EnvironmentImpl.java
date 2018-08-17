package horus.datamining;

public class EnvironmentImpl implements Environment
{
	private String dbUrl;
	private String dbUser;
	private String dbPassword;
	private String modelPath;
	

	@Override
	public void setDatabaseUrl(String value)
	{
		this.dbUrl = value;
	}


	@Override
	public void setDatabaseUser(String value)
	{
		this.dbUser = value;
	}


	@Override
	public void setDatabasePassword(String value)
	{
		this.dbPassword = value;
	}


	@Override
	public String getDatabaseUrl()
	{
		return dbUrl;
	}


	@Override
	public String getDatabaseUser()
	{
		return dbUser;
	}


	@Override
	public String getDatabasePassword()
	{
		return dbPassword;
	}


	@Override
	public void setModelPath(String value)
	{
		modelPath = value;
	}


	@Override
	public String getModelPath()
	{
		return modelPath;
	}

}