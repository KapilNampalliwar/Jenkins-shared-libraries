def call(String url, String branch){
  echo "📥 Cloning the repository..."
  git url: "${url}", branch: "${branch}"
}
