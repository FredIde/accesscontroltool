package biz.netcentric.cq.tools.actool.installhook;

import javax.jcr.Session;

import com.day.jcr.vault.fs.io.Archive;

public interface AcToolInstallHoookService {

	public void installYamlFilesFromPackage(Archive archive, Session session)
			throws Exception;

}