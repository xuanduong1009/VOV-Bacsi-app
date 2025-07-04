// Import firebase-admin
const admin = require('firebase-admin');

// Đường dẫn tới file JSON key dịch vụ
const serviceAccount = require('./vovbacsi-b4448-firebase-adminsdk-5hvp4-13b61629ee.json');

// Khởi tạo ứng dụng Firebase Admin
admin.initializeApp({
  credential: admin.credential.cert(serviceAccount)
});

// Hàm để thêm vai trò admin cho một tài khoản người dùng
async function addAdminRole(email) {
  try {
    const user = await admin.auth().getUserByEmail(email);
    await admin.auth().setCustomUserClaims(user.uid, { role: 'admin' });
    console.log(`Successfully added admin role to ${email}`);
  } catch (error) {
    console.error('Error setting admin role:', error);
  }
}

// Gọi hàm với email của tài khoản cần thêm quyền admin
addAdminRole('0338798636@gmail.com');

