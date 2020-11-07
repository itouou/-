package jp.co.sss.crud.model.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jp.co.sss.crud.model.beans.RoseBeans;

public class RoseDao {

	public static List<RoseBeans> selectAll() {

		Connection con =null;
		PreparedStatement ps = null;
		List<RoseBeans> roseList = null;

		try {
			con = DBManager.getConnection();

			// SQL文を準備
			String sql = ""
					+"SELECT "
					+"RoseID, "
					+"RoseName, "
					+"RosePicture, "
					+"price "
					+"FROM "
					+"";//テーブル名考えんといかん


			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			// 検索結果をbeanに格納する
			while (rs.next()) {
				RoseBeans rosebeans = new RoseBeans();
				rosebeans.setRoseId(rs.getInt("RoseID"));
				rosebeans.setRoseName(rs.getString("RoseName"));
				rosebeans.setRosePicture(rs.getString("RosePicture"));
				rosebeans.setRosePrice(rs.getInt("price"));
				roseList.add(rosebeans);
			}
		} catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // DB切断処理
            DBManager.close(ps, con);
        }
		return roseList;

		}
	public static RoseBeans selectOne() {

		Connection con =null;
		PreparedStatement ps = null;
		RoseBeans rosebeans = null;

		try {
			con = DBManager.getConnection();

			// SQL文を準備
			String sql = ""
					+"SELECT "
					+"RoseID, "
					+"RoseName, "
					+"RosePicture, "
					+"price "
					+"FROM "
					+"";//テーブル名考えんといかん


			ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			// 検索結果をbeanに格納する
			while (rs.next()) {
				rosebeans = new RoseBeans();
				rosebeans.setRoseId(rs.getInt("RoseID"));
				rosebeans.setRoseName(rs.getString("RoseName"));
				rosebeans.setRosePicture(rs.getString("RosePicture"));
				rosebeans.setRosePrice(rs.getInt("price"));
			}
		} catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // DB切断処理
            DBManager.close(ps, con);
        }
		return rosebeans;

		}
	}


